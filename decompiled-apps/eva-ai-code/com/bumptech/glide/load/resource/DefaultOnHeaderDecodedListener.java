package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
/* loaded from: classes2.dex */
public final class DefaultOnHeaderDecodedListener implements ImageDecoder$OnHeaderDecodedListener {
    private static final String TAG = "ImageDecoder";
    private final DecodeFormat decodeFormat;
    private final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
    private final boolean isHardwareConfigAllowed;
    private final PreferredColorSpace preferredColorSpace;
    private final int requestedHeight;
    private final int requestedWidth;
    private final DownsampleStrategy strategy;

    public DefaultOnHeaderDecodedListener(int i, int i2, Options options) {
        this.requestedWidth = i;
        this.requestedHeight = i2;
        this.decodeFormat = (DecodeFormat) options.get(Downsampler.DECODE_FORMAT);
        this.strategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        this.isHardwareConfigAllowed = options.get(Downsampler.ALLOW_HARDWARE_CONFIG) != null && ((Boolean) options.get(Downsampler.ALLOW_HARDWARE_CONFIG)).booleanValue();
        this.preferredColorSpace = (PreferredColorSpace) options.get(Downsampler.PREFERRED_COLOR_SPACE);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z = false;
        if (this.hardwareConfigState.isHardwareConfigAllowed(this.requestedWidth, this.requestedHeight, this.isHardwareConfigAllowed, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.decodeFormat == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener.1
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        });
        size = imageInfo.getSize();
        int i = this.requestedWidth;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.requestedHeight;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float scaleFactor = this.strategy.getScaleFactor(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * scaleFactor);
        int round2 = Math.round(size.getHeight() * scaleFactor);
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + scaleFactor);
        }
        imageDecoder.setTargetSize(round, round2);
        if (this.preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                if (this.preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
