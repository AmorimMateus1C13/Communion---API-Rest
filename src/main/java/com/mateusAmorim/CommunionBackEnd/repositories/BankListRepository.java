package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.BankListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BankListRepository extends JpaRepository<BankListModel, Long> {

    Optional<BankListModel> findByBankName(String bankName);

    Optional<BankListModel> findByBankCode(Integer bankCode);

    Optional<BankListModel> findById(Long id);
}
