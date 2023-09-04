package com.algaworks.single-app.api.repository.journalentry;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.algaworks.single-app.api.dto.JournalEntryCategoryStatistics;
import com.algaworks.single-app.api.dto.JournalEntryPerDayStatistics;
import com.algaworks.single-app.api.dto.JournalEntryPersonStatistics;
import com.algaworks.single-app.api.model.JournalEntry;
import com.algaworks.single-app.api.repository.filter.JournalEntryFilter;
import com.algaworks.single-app.api.repository.projection.JournalEntrySummary;

public interface JournalEntryRepositoryQuery {
	
	public List<JournalEntryPersonStatistics> byPerson(LocalDate begin, LocalDate end);
	public List<JournalEntryCategoryStatistics> byCategory(LocalDate referenceMonth);
	public List<JournalEntryPerDayStatistics> byDay(LocalDate referenceMonth);
	
	public Page<JournalEntry> filter(JournalEntryFilter journalEntryFilter, Pageable pageable);
	public Page<JournalEntrySummary> summarize(JournalEntryFilter journalEntryFilter, Pageable pageable);

}
