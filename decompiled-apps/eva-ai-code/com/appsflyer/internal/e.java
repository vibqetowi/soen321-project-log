package com.appsflyer.internal;

import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
/* loaded from: classes2.dex */
public class e {
    private static long onAppOpenAttribution = 0;
    public static byte[] onAppOpenAttributionNative = null;
    private static int onAttributionFailure = 0;
    private static Object onConversionDataFail = null;
    private static Object onConversionDataSuccess = null;
    public static final int onDeepLinking = 0;
    private static int onResponse = 1;
    public static final byte[] onResponseError = null;
    private static int onResponseErrorNative;
    public static byte[] onResponseNative;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:26:0x0067). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = onResponse + 125;
        int i6 = i5 % 128;
        onAttributionFailure = i6;
        int i7 = i5 % 2;
        byte[] bArr = onResponseError;
        int i8 = -i;
        int i9 = ((i8 | 36) << 1) - (i8 ^ 36);
        int i10 = 998 - s;
        int i11 = 119 - b;
        byte[] bArr2 = new byte[i9];
        if (bArr == null) {
            int i12 = i6 + 111;
            onResponse = i12 % 128;
            if ((i12 % 2 == 0 ? ':' : 'Y') == ':') {
                int i13 = 91 / 0;
            }
            int i14 = i9;
            i2 = 0;
            i10 = ((i10 & 1) << 1) + (i10 ^ 1);
            int i15 = -(-i11);
            int i16 = (i14 & i15) + (i15 | i14);
            i11 = ((i16 | (-3)) << 1) - (i16 ^ (-3));
            int i17 = (onResponse + 102) - 1;
            onAttributionFailure = i17 % 128;
            int i18 = i17 % 2;
            i3 = i9;
            int i19 = i11;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i19;
            if (i4 == i3) {
                String str = new String(bArr2, 0);
                int i20 = onAttributionFailure;
                int i21 = (i20 & 7) + (i20 | 7);
                onResponse = i21 % 128;
                if (i21 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            i9 = i3;
            i11 = bArr[i10];
            i2 = i4;
            i14 = i19;
            i10 = ((i10 & 1) << 1) + (i10 ^ 1);
            int i152 = -(-i11);
            int i162 = (i14 & i152) + (i152 | i14);
            i11 = ((i162 | (-3)) << 1) - (i162 ^ (-3));
            int i172 = (onResponse + 102) - 1;
            onAttributionFailure = i172 % 128;
            int i182 = i172 % 2;
            i3 = i9;
            int i192 = i11;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i192;
            if (i4 == i3) {
            }
        } else {
            i2 = 0;
            i3 = i9;
            int i1922 = i11;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i1922;
            if (i4 == i3) {
            }
        }
    }

    public static int AFInAppEventParameterName(int i) {
        int i2 = onAttributionFailure;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        onResponse = i3 % 128;
        int i4 = i3 % 2;
        Object obj = onConversionDataSuccess;
        int i5 = (i2 & 105) + (i2 | 105);
        onResponse = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = onResponseError;
            int intValue = ((Integer) Class.forName($$c(bArr[431], (short) (-bArr[398]), bArr[167]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[12], (short) 679, bArr[431]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i7 = onAttributionFailure + 97;
            onResponse = i7 % 128;
            int i8 = i7 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFInAppEventParameterName(int i, int i2, char c) {
        int i3 = onResponse;
        int i4 = (i3 ^ 85) + ((i3 & 85) << 1);
        onAttributionFailure = i4 % 128;
        int i5 = i4 % 2;
        Object obj = onConversionDataSuccess;
        int i6 = ((i3 | 27) << 1) - (i3 ^ 27);
        onAttributionFailure = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = onResponseError;
            Object invoke = Class.forName($$c(bArr[431], (short) (-bArr[398]), bArr[167]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[12], (short) HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, bArr[646]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, objArr);
            int i8 = onResponse;
            int i9 = (i8 ^ 79) + ((i8 & 79) << 1);
            onAttributionFailure = i9 % 128;
            if (i9 % 2 == 0) {
                return invoke;
            }
            int i10 = 94 / 0;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFInAppEventType(Object obj) {
        int i = onAttributionFailure + 47;
        int i2 = i % 128;
        onResponse = i2;
        if ((i % 2 == 0 ? 'A' : ',') == ',') {
            Object obj2 = onConversionDataSuccess;
            int i3 = (i2 & 27) + (i2 | 27);
            onAttributionFailure = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr = {obj};
                byte[] bArr = onResponseError;
                int intValue = ((Integer) Class.forName($$c(bArr[431], (short) (-bArr[398]), bArr[167]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[12], (short) HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, bArr[646]), Object.class).invoke(obj2, objArr)).intValue();
                int i5 = (onAttributionFailure + 2) - 1;
                onResponse = i5 % 128;
                int i6 = i5 % 2;
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    static void init$0() {
        int i = (onResponse + WebSocketProtocol.PAYLOAD_SHORT) - 1;
        onAttributionFailure = i % 128;
        int i2 = i % 2;
        byte[] bArr = new byte[1016];
        System.arraycopy("G»¾\u0012ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7Ä\u0003\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\b\u0006(Ö2\u0003Ø4ò\f\tã(úøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tî\u000e\fó\u0011\u0001\u0012Þ\u001a\u0003\u0010õ\u0012Ñ&\u0004\f\u0006öû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\b\b\u001d\u0017ý\u0004þ\u0006öõ\u001eò\u0012\u0003ø\u0010ô\n\u0017í\b\t\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9ÂOö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ\u0001\u0012ã\u0017\röÿ\u0006ï%ú\t\u0006ú\u000e\b7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½)\u0014\u0016ÿä\"ø\u0006\nô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8Ä\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1016);
        onResponseError = bArr;
        onDeepLinking = 82;
        int i3 = onAttributionFailure;
        int i4 = (i3 & 67) + (i3 | 67);
        onResponse = i4 % 128;
        int i5 = i4 % 2;
    }

    private e() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:649:0x144b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.e.<clinit>():void");
    }
}
