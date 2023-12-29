package com.joseph.repository;

import com.joseph.entity.LineOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineOrderRepository extends JpaRepository<LineOrder,Long> {
}
