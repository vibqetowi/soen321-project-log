package com.bugsnag.android.internal;

import com.bugsnag.android.Configuration;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: ImmutableConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ImmutableConfigKt$convertToImmutableConfig$1 extends k implements a<File> {
    final /* synthetic */ Configuration $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableConfigKt$convertToImmutableConfig$1(Configuration configuration) {
        super(0);
        this.$config = configuration;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final File invoke() {
        File persistenceDirectory = this.$config.getPersistenceDirectory();
        if (persistenceDirectory != null) {
            return persistenceDirectory;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
