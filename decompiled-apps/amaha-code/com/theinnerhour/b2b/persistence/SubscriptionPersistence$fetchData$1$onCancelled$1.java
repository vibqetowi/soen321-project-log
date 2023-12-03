package com.theinnerhour.b2b.persistence;

import com.theinnerhour.b2b.model.SubscriptionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: SubscriptionPersistence.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs/k;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionPersistence$fetchData$1$onCancelled$1 extends k implements ss.a<hs.k> {
    public static final SubscriptionPersistence$fetchData$1$onCancelled$1 INSTANCE = new SubscriptionPersistence$fetchData$1$onCancelled$1();

    public SubscriptionPersistence$fetchData$1$onCancelled$1() {
        super(0);
    }

    @Override // ss.a
    public /* bridge */ /* synthetic */ hs.k invoke() {
        invoke2();
        return hs.k.f19476a;
    }

    @Override // ss.a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        SubscriptionModel subscriptionModel;
        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
        str = SubscriptionPersistence.SUBSCRIPTION_PERSISTENCE_STRING;
        String stringValue = applicationPersistence.getStringValue(str);
        if (stringValue != null && !i.b(stringValue, "")) {
            Object b10 = new sf.i().b(SubscriptionModel.class, stringValue);
            i.f(b10, "{\n                      …                        }");
            subscriptionModel = (SubscriptionModel) b10;
        } else {
            subscriptionModel = new SubscriptionModel();
        }
        SubscriptionPersistence.subscriptionModel = subscriptionModel;
        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
        subscriptionPersistence.validateSubscription();
        subscriptionPersistence.subscriptionDataChanged(false);
    }
}
