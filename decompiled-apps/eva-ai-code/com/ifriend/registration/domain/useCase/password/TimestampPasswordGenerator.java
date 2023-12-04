package com.ifriend.registration.domain.useCase.password;

import java.util.Date;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: TimestampPasswordGenerator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/domain/useCase/password/TimestampPasswordGenerator;", "Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;", "()V", "generate", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimestampPasswordGenerator implements PasswordGenerator {
    @Override // com.ifriend.registration.domain.useCase.password.PasswordGenerator
    public String generate() {
        long time = new Date().getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(time);
        sb.append(RangesKt.random(new IntRange(1, 9000), Random.Default) + 1000);
        return sb.toString();
    }
}
