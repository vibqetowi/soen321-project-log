package com.moengage.core.internal.rest.exceptions;

import kotlin.Metadata;
/* compiled from: InvalidRequestException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/moengage/core/internal/rest/exceptions/InvalidRequestException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class InvalidRequestException extends IllegalStateException {
    public InvalidRequestException() {
        super("GET request cannot have a body.");
    }
}
