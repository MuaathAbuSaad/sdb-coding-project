package account.service;

import account.model.Account;
import account.dto.AccountDto;
import account.payload.AccountTransferPayload;

import java.util.List;

public interface AccountService {

    public void createAccount(AccountDto account);

    public List<AccountDto> getAccounts();

    public void transferAccount(Long accountFrom, AccountTransferPayload transfer);

    public Account getAccountByNumber(Long accountNumber);

}
