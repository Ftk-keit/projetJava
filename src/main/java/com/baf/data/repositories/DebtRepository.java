package com.baf.data.repositories;

import java.util.List;

import com.baf.core.Repository;
import com.baf.data.entities.Client;
import com.baf.data.entities.Debt;

public interface DebtRepository extends Repository<Debt> {
    public List<Debt> getAllPaidDebt();
    public List<Debt> getAllUnpaidDebt();
    public void archivePaidDebt(List<Debt> debts);
    public List<Debt> getDebtsFromClient( Client client);
    public Debt getDebtById(int id);
}