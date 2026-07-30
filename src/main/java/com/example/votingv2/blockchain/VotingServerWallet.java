package com.example.votingv2.blockchain;

import org.web3j.crypto.Credentials;

public class VotingServerWallet {
    private static final String PRIVATE_KEY = ; // MetaMask 지갑의 private key

    public static Credentials getCredentials() {
        return Credentials.create(PRIVATE_KEY);
    }
}
