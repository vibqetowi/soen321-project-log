package com.bugsnag.android.internal;

import android.content.Context;
import com.bugsnag.android.Configuration;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: ImmutableConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ImmutableConfigKt$sanitiseConfiguration$1 extends k implements a<File> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Configuration $configuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableConfigKt$sanitiseConfiguration$1(Configuration configuration, Context context) {
        super(0);
        this.$configuration = configuration;
        this.$appContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final File invoke() {
        File persistenceDirectory = this.$configuration.getPersistenceDirectory();
        return persistenceDirectory != null ? persistenceDirectory : this.$appContext.getCacheDir();
    }
}
