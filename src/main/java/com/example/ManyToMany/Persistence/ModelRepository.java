package com.example.ManyToMany.Persistence;

import com.example.ManyToMany.Domain.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ModelRepository<T extends Country> extends PagingAndSortingRepository<T,Long> {
}
