package com.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, String> {
    // Additional query methods can be defined here
}
