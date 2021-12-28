package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import lombok.Data;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
