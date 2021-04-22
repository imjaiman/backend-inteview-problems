package com.practice.backend.objectOrientedDesign.bankApplication;

import com.practice.backend.objectOrientedDesign.bankApplication.bankException.BankException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rahul.jaiman
 * @version $Id: HeadOffice.java, v 0.1 2020-05-19 12:15 rahul.jaiman Exp $$
 */
public class HeadOffice {
    static Map<String, Branch> branches = new LinkedHashMap<>();

    public void createBranch(String branchId) {
        Branch branch = new Branch();
        branch.setBranchId(branchId);
        branches.put(branchId, branch);
    }

    public Branch getBranchById(String branchId) throws BankException {
        if (!branches.containsKey(branchId)) {
            throw new BankException("No Branch found with branchId: " + branchId);
        }
        return branches.get(branchId);
    }

    public List<Branch> getAllBranches() {
        List<Branch> allBranches = new ArrayList<>();
        for (String branchId : branches.keySet()) {
            allBranches.add(branches.get(branchId));
        }
        return allBranches;

    }
}