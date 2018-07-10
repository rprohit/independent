package com.sns.independent.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long documentId;
	private String documentName;
	private String fileDownloadUri;
	
	public Document() {}
	
	public Document(String documentName,String fileDownloadUri) {
		this.documentName = documentName;
		this.fileDownloadUri = fileDownloadUri;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}
}
