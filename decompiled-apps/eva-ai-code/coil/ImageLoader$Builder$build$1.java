package coil;

import android.content.Context;
import coil.ImageLoader;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/memory/MemoryCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoader$Builder$build$1 extends Lambda implements Function0<MemoryCache> {
    final /* synthetic */ ImageLoader.Builder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoader$Builder$build$1(ImageLoader.Builder builder) {
        super(0);
        this.this$0 = builder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MemoryCache invoke() {
        Context context;
        context = this.this$0.applicationContext;
        return new MemoryCache.Builder(context).build();
    }
}
