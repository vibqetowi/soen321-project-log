package androidx.camera.extensions.internal;

import android.content.Context;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfigFactory;
/* loaded from: classes.dex */
public final class ExtensionsUseCaseConfigFactory implements UseCaseConfigFactory {
    private final ImageCaptureConfigProvider mImageCaptureConfigProvider;
    private final PreviewConfigProvider mPreviewConfigProvider;

    public ExtensionsUseCaseConfigFactory(int i, VendorExtender vendorExtender, Context context) {
        this.mImageCaptureConfigProvider = new ImageCaptureConfigProvider(i, vendorExtender, context);
        this.mPreviewConfigProvider = new PreviewConfigProvider(i, vendorExtender, context);
    }

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i) {
        MutableOptionsBundle from;
        int i2 = AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[captureType.ordinal()];
        if (i2 == 1) {
            from = MutableOptionsBundle.from((Config) this.mImageCaptureConfigProvider.getConfig());
        } else if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
        } else {
            from = MutableOptionsBundle.from((Config) this.mPreviewConfigProvider.getConfig());
        }
        return OptionsBundle.from(from);
    }
}
