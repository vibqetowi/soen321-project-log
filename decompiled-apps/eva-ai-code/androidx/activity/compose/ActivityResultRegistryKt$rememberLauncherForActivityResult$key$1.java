package androidx.activity.compose;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ActivityResultRegistry.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements Function0<String> {
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
