package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class RawMessageInfo implements MessageInfo {
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        String str2;
        Throwable e;
        char charAt;
        this.defaultInstance = messageLite;
        this.info = str;
        this.objects = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str3.length()];
                    str3.getChars(0, str3.length(), cArr, 0);
                    str2 = new String(cArr);
                    try {
                        charAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e = e2;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    } catch (StringIndexOutOfBoundsException e3) {
                        e = e3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e4) {
                str2 = str3;
                e = e4;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.flags = (charAt2 << i3) | i2;
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getStringInfo() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] getObjects() {
        return this.objects;
    }

    @Override // com.google.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return (this.flags & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
