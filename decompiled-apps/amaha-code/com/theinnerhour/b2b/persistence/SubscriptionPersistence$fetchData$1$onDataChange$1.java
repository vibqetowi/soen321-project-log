package com.theinnerhour.b2b.persistence;

import com.google.firebase.database.DataSnapshot;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: SubscriptionPersistence.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs/k;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionPersistence$fetchData$1$onDataChange$1 extends k implements ss.a<hs.k> {
    final /* synthetic */ DataSnapshot $p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionPersistence$fetchData$1$onDataChange$1(DataSnapshot dataSnapshot) {
        super(0);
        this.$p0 = dataSnapshot;
    }

    @Override // ss.a
    public /* bridge */ /* synthetic */ hs.k invoke() {
        invoke2();
        return hs.k.f19476a;
    }

    @Override // ss.a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SubscriptionModel subscriptionModel;
        SubscriptionModel subscriptionModel2;
        SubscriptionModel subscriptionModel3;
        String str;
        SubscriptionModel subscriptionModel4;
        SubscriptionModel subscriptionModel5;
        SubscriptionModel subscriptionModel6;
        SubscriptionModel subscriptionModel7;
        String str2;
        if (this.$p0.exists()) {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            Object value = this.$p0.getValue(SubscriptionModel.class);
            i.d(value);
            SubscriptionPersistence.subscriptionModel = (SubscriptionModel) value;
            sf.i iVar = new sf.i();
            subscriptionModel7 = SubscriptionPersistence.subscriptionModel;
            String g5 = iVar.g(subscriptionModel7);
            if (g5 != null) {
                if (g5.length() > 0) {
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    str2 = SubscriptionPersistence.SUBSCRIPTION_PERSISTENCE_STRING;
                    applicationPersistence.setStringValue(str2, g5);
                }
            }
        } else {
            Boolean ENABLE_SUBSCRIPTION = Constants.ENABLE_SUBSCRIPTION;
            i.f(ENABLE_SUBSCRIPTION, "ENABLE_SUBSCRIPTION");
            if (ENABLE_SUBSCRIPTION.booleanValue()) {
                SubscriptionPersistence subscriptionPersistence2 = SubscriptionPersistence.INSTANCE;
                SubscriptionPersistence.subscriptionModel = new SubscriptionModel();
                subscriptionModel4 = SubscriptionPersistence.subscriptionModel;
                subscriptionModel4.setStatus(Constants.STATE_PURCHASED);
                subscriptionModel5 = SubscriptionPersistence.subscriptionModel;
                subscriptionModel5.setPlan(Constants.SUBSCRIPTION_BASIC_3);
                subscriptionModel6 = SubscriptionPersistence.subscriptionModel;
                subscriptionModel6.setExpiryTime(1767159456000L);
            } else {
                SubscriptionPersistence subscriptionPersistence3 = SubscriptionPersistence.INSTANCE;
                SubscriptionPersistence.subscriptionModel = new SubscriptionModel();
                subscriptionModel = SubscriptionPersistence.subscriptionModel;
                subscriptionModel.setStatus(Constants.STATE_NOT_PURCHASED);
                subscriptionModel2 = SubscriptionPersistence.subscriptionModel;
                subscriptionModel2.setPlan(Constants.SUBSCRIPTION_NONE);
            }
            sf.i iVar2 = new sf.i();
            subscriptionModel3 = SubscriptionPersistence.subscriptionModel;
            String g10 = iVar2.g(subscriptionModel3);
            if (g10 != null) {
                if (g10.length() > 0) {
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    str = SubscriptionPersistence.SUBSCRIPTION_PERSISTENCE_STRING;
                    applicationPersistence2.setStringValue(str, g10);
                }
            }
        }
        SubscriptionPersistence subscriptionPersistence4 = SubscriptionPersistence.INSTANCE;
        subscriptionPersistence4.validateSubscription();
        subscriptionPersistence4.subscriptionDataChanged(true);
    }
}
