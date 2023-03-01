package account.controller;

import account.dto.AccountDto;
import account.payload.AccountTransferPayload;
import account.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Void> createAccount(@RequestBody AccountDto accountDto) {
        accountService.createAccount(accountDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAccounts() {
        List<AccountDto> accounts = accountService.getAccounts();
        return ResponseEntity.ok(accounts);
    }

    @PostMapping("/accounts/{accountNumber}/transfer")
    public ResponseEntity<Void> transferAccount(@PathVariable Long accountNumber,
                                                @RequestBody AccountTransferPayload accountTransfer) {

        accountService.transferAccount(accountNumber, accountTransfer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
