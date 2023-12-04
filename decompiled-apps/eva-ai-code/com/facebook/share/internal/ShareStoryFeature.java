package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.facebook.internal.NativeProtocol;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: ShareStoryFeature.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/share/internal/ShareStoryFeature;", "", "Lcom/facebook/internal/DialogFeature;", "minVersion", "", "(Ljava/lang/String;II)V", "getAction", "", "getMinVersion", "SHARE_STORY_ASSET", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum ShareStoryFeature implements DialogFeature {
    SHARE_STORY_ASSET(NativeProtocol.PROTOCOL_VERSION_20170417);
    
    private final int minVersion;

    @Override // com.facebook.internal.DialogFeature
    public String getAction() {
        return NativeProtocol.ACTION_SHARE_STORY;
    }

    ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.DialogFeature
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShareStoryFeature[] valuesCustom() {
        ShareStoryFeature[] valuesCustom = values();
        return (ShareStoryFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
