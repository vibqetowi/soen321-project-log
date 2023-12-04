package androidx.compose.ui.text.input;

import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlatformTextInputAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.AdapterWithRefCount<T> $adapterWithRefCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(PlatformTextInputPluginRegistryImpl.AdapterWithRefCount<T> adapterWithRefCount) {
        super(0);
        this.$adapterWithRefCount = adapterWithRefCount;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$adapterWithRefCount.decrementRefCount());
    }
}
