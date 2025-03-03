package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.Document;
import com.example.FamilyFinance.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;
    public Document createDocument(@RequestBody Document document){
        return documentService.createDocument(document);
    }

    @GetMapping("/{documentId}")
    public Document getDocumentById(@PathVariable Long documentId){
        return documentService.getDocumentById(documentId);
    }
    @GetMapping
    public List<Document> getAllDocument(){
        return documentService.getAllDocument();
    }

    @PutMapping("/{documentId}")
    public Document updateDocument(@PathVariable Long documentId,@RequestBody Document document){
        return documentService.updateDocument(documentId,document);
    }
    @DeleteMapping("/{documentId}")
    public void deleteDocument(@PathVariable Long documentId){
        documentService.deleteMapping(documentId);
    }

}
