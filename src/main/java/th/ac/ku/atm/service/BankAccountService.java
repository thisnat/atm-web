package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private List<BankAccount> bankAccountList;

    @PostConstruct
    public void postConstruct(){
        this.bankAccountList = new ArrayList<BankAccount>();
    }

    public void createBankAccount(BankAccount bankAccount){
        bankAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccount(){
        return new ArrayList<BankAccount>(this.bankAccountList);
    }
}
