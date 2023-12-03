package com.appsflyer.internal;

import com.appsflyer.R;
/* loaded from: classes.dex */
public class AFb1jSDK {
    private static int getOutOfStore = 0;
    public static byte[] getSdkVersion = null;
    public static byte[] onPause = null;
    private static Object setAndroidIdData = null;
    public static final int setCustomerIdAndLogSession = 0;
    public static final byte[] setCustomerUserId = null;
    private static Object setDebugLog = null;
    private static byte setImeiData = 0;
    private static long setOaidData = 0;
    private static int setOutOfStore = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r6 != 'c') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r6 != 6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        r0 = r4;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r9 = (r0 & com.appsflyer.R.styleable.AppCompatTheme_windowMinWidthMinor) + (r0 | com.appsflyer.R.styleable.AppCompatTheme_windowMinWidthMinor);
        com.appsflyer.internal.AFb1jSDK.getOutOfStore = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if ((r9 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        r9 = 'B';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        r9 = '2';
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r9 != '2') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        r9 = r8;
        r0 = r4;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:26:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i6, short s10, int i10) {
        boolean z10;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        byte[] bArr2;
        char c10;
        int i14;
        char c11;
        int i15 = setOutOfStore;
        int i16 = i15 + 85;
        getOutOfStore = i16 % 128;
        if (i16 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = setCustomerUserId;
            int i17 = -s10;
            i11 = (i17 ^ R.styleable.AppCompatTheme_tooltipFrameBackground) + ((i17 & R.styleable.AppCompatTheme_tooltipFrameBackground) << 1);
            i12 = 16323 / i6;
            i13 = i10 + 12;
            bArr2 = new byte[i11];
            if (bArr == null) {
                c11 = 'c';
            } else {
                c11 = 'L';
            }
        } else {
            bArr = setCustomerUserId;
            int i18 = -s10;
            i11 = (i18 ^ 36) + ((i18 & 36) << 1);
            int i19 = -i6;
            i12 = (i19 ^ 999) + ((i19 & 999) << 1);
            i13 = (i10 | 41) + (i10 & 41);
            bArr2 = new byte[i11];
            if (bArr == null) {
                c10 = 6;
            } else {
                c10 = 'M';
            }
        }
        i12++;
        int i20 = (i11 - (~r9)) - 1;
        i13 = (i20 & (-3)) + (i20 | (-3));
        int i21 = (getOutOfStore + 4) - 1;
        setOutOfStore = i21 % 128;
        int i22 = i21 % 2;
        i11 = i13;
        int i23 = r5 + 1;
        bArr2[r5] = (byte) i11;
        if (i23 != i14) {
            return new String(bArr2, 0);
        }
        int i24 = bArr[i12];
        int i25 = i23;
        i12++;
        int i202 = (i11 - (~i24)) - 1;
        i13 = (i202 & (-3)) + (i202 | (-3));
        int i212 = (getOutOfStore + 4) - 1;
        setOutOfStore = i212 % 128;
        int i222 = i212 % 2;
        i11 = i13;
        int i232 = i25 + 1;
        bArr2[i25] = (byte) i11;
        if (i232 != i14) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:717:0x16f0
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1jSDK.<clinit>():void");
    }

    private AFb1jSDK() {
    }

    public static int AFInAppEventParameterName(Object obj) {
        int i6 = getOutOfStore;
        int i10 = ((i6 | 41) << 1) - (i6 ^ 41);
        int i11 = i10 % 128;
        setOutOfStore = i11;
        int i12 = i10 % 2;
        Object obj2 = setDebugLog;
        int i13 = (i11 + 18) - 1;
        getOutOfStore = i13 % 128;
        int i14 = i13 % 2;
        try {
            Object[] objArr = {obj};
            int i15 = setCustomerIdAndLogSession;
            byte[] bArr = setCustomerUserId;
            int intValue = ((Integer) Class.forName($$c((short) ((i15 & 388) | (i15 ^ 388)), bArr[10], bArr[145]), true, (ClassLoader) setAndroidIdData).getMethod($$c((short) 599, bArr[69], bArr[30]), Object.class).invoke(obj2, objArr)).intValue();
            int i16 = setOutOfStore + 75;
            getOutOfStore = i16 % 128;
            int i17 = i16 % 2;
            return intValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int AFKeystoreWrapper(int i6) {
        int i10 = getOutOfStore;
        int i11 = ((i10 | R.styleable.AppCompatTheme_switchStyle) << 1) - (i10 ^ R.styleable.AppCompatTheme_switchStyle);
        setOutOfStore = i11 % 128;
        int i12 = i11 % 2;
        Object obj = setDebugLog;
        int i13 = i10 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        int i14 = i13 % 128;
        setOutOfStore = i14;
        int i15 = i13 % 2;
        int i16 = (i14 & R.styleable.AppCompatTheme_toolbarStyle) + (i14 | R.styleable.AppCompatTheme_toolbarStyle);
        getOutOfStore = i16 % 128;
        int i17 = i16 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i6)};
            int i18 = setCustomerIdAndLogSession;
            byte[] bArr = setCustomerUserId;
            int intValue = ((Integer) Class.forName($$c((short) ((i18 & 388) | (i18 ^ 388)), bArr[10], bArr[145]), true, (ClassLoader) setAndroidIdData).getMethod($$c((short) 599, bArr[69], bArr[30]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i19 = getOutOfStore;
            int i20 = ((i19 | 29) << 1) - (i19 ^ 29);
            setOutOfStore = i20 % 128;
            int i21 = i20 % 2;
            return intValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        char c10;
        int i6;
        int i10 = getOutOfStore;
        int i11 = ((i10 | 47) << 1) - (i10 ^ 47);
        setOutOfStore = i11 % 128;
        if (i11 % 2 == 0) {
            c10 = 'C';
        } else {
            c10 = 'X';
        }
        if (c10 != 'X') {
            byte[] bArr = new byte[1017];
            System.arraycopy("\u001f\u0097\u009aS7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8Ìú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001fÒ<ìô\nÜK\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\b\u0006(Ö2\u0003Ø4ò\f\tã(úøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\b\u0006(Ö2\u0003Ø4ò\f\tß\u0014\u0014ò\u000fû\u0012ô\u0010ß\u0016\u000fûú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\nú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001fÒ;íô\nÜ\u0003û\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ\u0001\u0012ã\u0017\röÿ\u0006ï%ú\t\u0006ú\u000e\b7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7Íú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001fÒ;íô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1017);
            setCustomerUserId = bArr;
            i6 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
        } else {
            byte[] bArr2 = new byte[1017];
            System.arraycopy("\u001f\u0097\u009aS7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8Ìú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001fÒ<ìô\nÜK\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\b\u0006(Ö2\u0003Ø4ò\f\tã(úøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\b\u0006(Ö2\u0003Ø4ò\f\tß\u0014\u0014ò\u000fû\u0012ô\u0010ß\u0016\u000fûú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\nú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001fÒ;íô\nÜ\u0003û\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ\u0001\u0012ã\u0017\röÿ\u0006ï%ú\t\u0006ú\u000e\b7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7Íú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001fÒ;íô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1017);
            setCustomerUserId = bArr2;
            i6 = 43;
        }
        setCustomerIdAndLogSession = i6;
        int i12 = getOutOfStore + R.styleable.AppCompatTheme_textColorSearchUrl;
        setOutOfStore = i12 % 128;
        int i13 = i12 % 2;
    }

    public static Object values(int i6, char c10, int i10) {
        char c11;
        int i11 = setOutOfStore;
        int i12 = (i11 + 66) - 1;
        getOutOfStore = i12 % 128;
        int i13 = i12 % 2;
        Object obj = setDebugLog;
        int i14 = (i11 ^ R.styleable.AppCompatTheme_windowFixedHeightMinor) + ((i11 & R.styleable.AppCompatTheme_windowFixedHeightMinor) << 1);
        getOutOfStore = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (i11 + R.styleable.AppCompatTheme_windowActionBarOverlay) - 1;
        getOutOfStore = i16 % 128;
        int i17 = i16 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i6), Character.valueOf(c10), Integer.valueOf(i10)};
            int i18 = setCustomerIdAndLogSession;
            byte[] bArr = setCustomerUserId;
            Class<?> cls = Class.forName($$c((short) ((i18 & 388) | (i18 ^ 388)), bArr[10], bArr[145]), true, (ClassLoader) setAndroidIdData);
            String $$c = $$c((short) 648, bArr[412], bArr[30]);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i19 = getOutOfStore + 93;
            setOutOfStore = i19 % 128;
            if (i19 % 2 == 0) {
                c11 = 'F';
            } else {
                c11 = 20;
            }
            if (c11 != 'F') {
                return invoke;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
