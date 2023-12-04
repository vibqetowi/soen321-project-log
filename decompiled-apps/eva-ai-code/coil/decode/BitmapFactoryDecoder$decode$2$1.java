package coil.decode;

import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BitmapFactoryDecoder.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/decode/DecodeResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder$decode$2$1 extends Lambda implements Function0<DecodeResult> {
    final /* synthetic */ BitmapFactoryDecoder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$2$1(BitmapFactoryDecoder bitmapFactoryDecoder) {
        super(0);
        this.this$0 = bitmapFactoryDecoder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DecodeResult invoke() {
        DecodeResult decode;
        decode = this.this$0.decode(new BitmapFactory.Options());
        return decode;
    }
}
