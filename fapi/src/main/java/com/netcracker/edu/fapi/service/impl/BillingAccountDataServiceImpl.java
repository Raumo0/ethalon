package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.BillingAccountViewModel;
import com.netcracker.edu.fapi.service.BillingAccountDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BillingAccountDataServiceImpl implements BillingAccountDataService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<BillingAccountViewModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        BillingAccountViewModel[] billingAccountViewModelResponse = restTemplate.getForObject(backendServerUrl + "/api/billing-accounts/all", BillingAccountViewModel[].class);
        return billingAccountViewModelResponse == null ? Collections.emptyList() : Arrays.asList(billingAccountViewModelResponse);
    }

    @Override
    public BillingAccountViewModel getBillingAccountById(Long id) {
        return null;
    }

    @Override
    public BillingAccountViewModel saveBillingAccount(BillingAccountViewModel account) {
        return null;
    }

    @Override
    public ResponseEntity deleteBillingAccount(Long id) {
        return null;
    }
}