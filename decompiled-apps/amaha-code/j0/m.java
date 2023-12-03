package j0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import i0.d;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public final class m extends o {
    public static Font g(FontFamily fontFamily, int i6) {
        int i10;
        int i11;
        if ((i6 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i6 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int h10 = h(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int h11 = h(fontStyle, font2.getStyle());
            if (h11 < h10) {
                font = font2;
                h10 = h11;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i6;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i6 = 0;
        } else {
            i6 = 2;
        }
        return abs + i6;
    }

    @Override // j0.o
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        d.C0297d[] c0297dArr;
        int i10;
        try {
            FontFamily.Builder builder = null;
            for (d.C0297d c0297d : cVar.f19616a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c0297d.f).setWeight(c0297d.f19618b);
                    if (c0297d.f19619c) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    Font build = weight.setSlant(i10).setTtcIndex(c0297d.f19621e).setFontVariationSettings(c0297d.f19620d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // j0.o
    public final Typeface b(Context context, p0.m[] mVarArr, int i6) {
        ParcelFileDescriptor openFileDescriptor;
        int i10;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (p0.m mVar : mVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(mVar.f27854a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(mVar.f27856c);
                        if (mVar.f27857d) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        Font build = weight.setSlant(i10).setTtcIndex(mVar.f27855b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // j0.o
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // j0.o
    public final Typeface d(Context context, Resources resources, int i6, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // j0.o
    public final p0.m f(int i6, p0.m[] mVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
