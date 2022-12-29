package com.maniatis.demo.mikedemosspringcassandra;

import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {

    Subscription findByAccountHash(String acctHash);
}
