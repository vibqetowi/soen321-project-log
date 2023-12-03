package j$.util.concurrent;
/* loaded from: classes3.dex */
public abstract /* synthetic */ class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Object obj, Object obj2) {
        String obj3;
        String str = "null";
        String str2 = (obj == null || (str2 = obj.toString()) == null) ? "null" : "null";
        int length = str2.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str = obj3;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        str2.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
