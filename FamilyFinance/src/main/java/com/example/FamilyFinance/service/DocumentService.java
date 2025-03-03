package com.example.FamilyFinance.service;

import com.example.FamilyFinance.entity.Document;
import com.example.FamilyFinance.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;
    public Document createDocument(Document document) {
        return documentRepository.save(document);
    }

    public Document getDocumentById(Long documentId) {
        return documentRepository.findById(documentId).orElse(null);
    }

    public List<Document> getAllDocument() {
        return documentRepository.findAll();
    }

    public Document updateDocument(Long documentId, Document document) {
        if (documentRepository.existsById(documentId)){
            document.setDocumentId(documentId);
            return documentRepository.save(document);
        }
        return null;
    }

    public void deleteMapping(Long documentId) {
        documentRepository.deleteById(documentId);
    }
}
