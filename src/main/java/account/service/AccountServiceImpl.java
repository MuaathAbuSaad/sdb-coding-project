package account.service;

import account.dto.AccountDto;
import account.model.Account;
import account.payload.AccountTransferPayload;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void createAccount(AccountDto account) {
        //validate the account
        //create a new account
    }

    @Override
    public List<AccountDto> getAccounts() {
        return Arrays.asList(new AccountDto());
    }

    @Override
    public void transferAccount(Long accountFrom, AccountTransferPayload transfer) {
        //validate both accounts
        // validate the sender balance

    }

    @Override
    public Account getAccountByNumber(Long accountNumber) {
        return null;
    }
}
