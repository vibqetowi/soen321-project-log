package com.google.crypto.tink.subtle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int len);

        public abstract boolean process(byte[] input, int offset, int len, boolean finish);

        Coder() {
        }
    }

    public static byte[] decode(String input) {
        return decode(input, 2);
    }

    public static byte[] urlSafeDecode(String input) {
        return decode(input, 11);
    }

    public static byte[] decode(String str, int flags) {
        return decode(str.getBytes(UTF_8), flags);
    }

    public static byte[] decode(byte[] input, int flags) {
        return decode(input, 0, input.length, flags);
    }

    public static byte[] decode(byte[] input, int offset, int len, int flags) {
        Decoder decoder = new Decoder(flags, new byte[(len * 3) / 4]);
        if (!decoder.process(input, offset, len, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.op == decoder.output.length) {
            return decoder.output;
        }
        byte[] bArr = new byte[decoder.op];
        System.arraycopy(decoder.output, 0, bArr, 0, decoder.op);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int flags, byte[] output) {
            this.output = output;
            this.alphabet = (flags & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 3) / 4) + 10;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] input, int offset, int len, boolean finish) {
            int i = this.state;
            if (i == 6) {
                return false;
            }
            int i2 = len + offset;
            int i3 = this.value;
            byte[] bArr = this.output;
            int[] iArr = this.alphabet;
            int i4 = 0;
            int i5 = i3;
            int i6 = i;
            int i7 = offset;
            while (i7 < i2) {
                if (i6 == 0) {
                    while (true) {
                        int i8 = i7 + 4;
                        if (i8 > i2 || (i5 = (iArr[input[i7] & 255] << 18) | (iArr[input[i7 + 1] & 255] << 12) | (iArr[input[i7 + 2] & 255] << 6) | iArr[input[i7 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr[i4 + 2] = (byte) i5;
                        bArr[i4 + 1] = (byte) (i5 >> 8);
                        bArr[i4] = (byte) (i5 >> 16);
                        i4 += 3;
                        i7 = i8;
                    }
                    if (i7 >= i2) {
                        break;
                    }
                }
                int i9 = i7 + 1;
                int i10 = iArr[input[i7] & 255];
                if (i6 != 0) {
                    if (i6 == 1) {
                        if (i10 < 0) {
                            if (i10 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i10 |= i5 << 6;
                    } else if (i6 == 2) {
                        if (i10 < 0) {
                            if (i10 == -2) {
                                bArr[i4] = (byte) (i5 >> 4);
                                i4++;
                                i6 = 4;
                            } else if (i10 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i10 |= i5 << 6;
                    } else if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5 && i10 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i10 == -2) {
                            i6++;
                        } else if (i10 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i10 >= 0) {
                        int i11 = i10 | (i5 << 6);
                        bArr[i4 + 2] = (byte) i11;
                        bArr[i4 + 1] = (byte) (i11 >> 8);
                        bArr[i4] = (byte) (i11 >> 16);
                        i4 += 3;
                        i5 = i11;
                        i6 = 0;
                    } else if (i10 == -2) {
                        bArr[i4 + 1] = (byte) (i5 >> 2);
                        bArr[i4] = (byte) (i5 >> 10);
                        i4 += 2;
                        i6 = 5;
                    } else if (i10 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i6++;
                    i5 = i10;
                } else {
                    if (i10 < 0) {
                        if (i10 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i6++;
                    i5 = i10;
                }
                i7 = i9;
            }
            if (!finish) {
                this.state = i6;
                this.value = i5;
                this.op = i4;
                return true;
            } else if (i6 == 1) {
                this.state = 6;
                return false;
            } else {
                if (i6 == 2) {
                    bArr[i4] = (byte) (i5 >> 4);
                    i4++;
                } else if (i6 == 3) {
                    int i12 = i4 + 1;
                    bArr[i4] = (byte) (i5 >> 10);
                    i4 = i12 + 1;
                    bArr[i12] = (byte) (i5 >> 2);
                } else if (i6 == 4) {
                    this.state = 6;
                    return false;
                }
                this.state = i6;
                this.op = i4;
                return true;
            }
        }
    }

    public static String encode(final byte[] input) {
        return encodeToString(input, 2);
    }

    public static String urlSafeEncode(final byte[] input) {
        return encodeToString(input, 11);
    }

    public static String encodeToString(byte[] input, int flags) {
        try {
            return new String(encode(input, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String encodeToString(byte[] input, int offset, int len, int flags) {
        try {
            return new String(encode(input, offset, len, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] encode(byte[] input, int flags) {
        return encode(input, 0, input.length, flags);
    }

    public static byte[] encode(byte[] input, int offset, int len, int flags) {
        Encoder encoder = new Encoder(flags, null);
        int i = (len / 3) * 4;
        if (encoder.doPadding) {
            if (len % 3 > 0) {
                i += 4;
            }
        } else {
            int i2 = len % 3;
            if (i2 == 1) {
                i += 2;
            } else if (i2 == 2) {
                i += 3;
            }
        }
        if (encoder.doNewline && len > 0) {
            i += (((len - 1) / 57) + 1) * (encoder.doCr ? 2 : 1);
        }
        encoder.output = new byte[i];
        encoder.process(input, offset, len, true);
        return encoder.output;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int flags, byte[] output) {
            this.output = output;
            this.doPadding = (flags & 1) == 0;
            boolean z = (flags & 2) == 0;
            this.doNewline = z;
            this.doCr = (flags & 4) != 0;
            this.alphabet = (flags & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z ? 19 : -1;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        @Override // com.google.crypto.tink.subtle.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }
}
