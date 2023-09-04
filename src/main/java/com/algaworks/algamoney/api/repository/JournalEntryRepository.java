package com.algaworks.single-app.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.JournalEntry;
import com.algaworks.single-app.api.repository.journalentry.JournalEntryRepositoryQuery;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long>, JournalEntryRepositoryQuery {
	
	List<JournalEntry> findByDueDateLessThanEqualAndPaymentDateIsNull(LocalDate date);

}
