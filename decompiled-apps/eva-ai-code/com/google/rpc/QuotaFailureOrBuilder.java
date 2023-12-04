package com.google.rpc;

import com.google.protobuf.MessageOrBuilder;
import com.google.rpc.QuotaFailure;
import java.util.List;
/* loaded from: classes6.dex */
public interface QuotaFailureOrBuilder extends MessageOrBuilder {
    QuotaFailure.Violation getViolations(int i);

    int getViolationsCount();

    List<QuotaFailure.Violation> getViolationsList();

    QuotaFailure.ViolationOrBuilder getViolationsOrBuilder(int i);

    List<? extends QuotaFailure.ViolationOrBuilder> getViolationsOrBuilderList();
}
