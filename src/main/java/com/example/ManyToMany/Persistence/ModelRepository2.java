package com.example.ManyToMany.Persistence;

import com.example.ManyToMany.Domain.Language;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ModelRepository2<T extends Language> extends PagingAndSortingRepository<T,Long> {
}
