package io.grpc.netty.shaded.io.netty.handler.codec.http.cookie;
/* loaded from: classes4.dex */
public final class CookieHeaderNames {
    public static final String DOMAIN = "Domain";
    public static final String EXPIRES = "Expires";
    public static final String HTTPONLY = "HTTPOnly";
    public static final String MAX_AGE = "Max-Age";
    public static final String PATH = "Path";
    public static final String SAMESITE = "SameSite";
    public static final String SECURE = "Secure";

    /* loaded from: classes4.dex */
    public enum SameSite {
        Lax,
        Strict,
        None;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static SameSite of(String str) {
            SameSite[] sameSiteArr;
            if (str != null) {
                for (SameSite sameSite : (SameSite[]) SameSite.class.getEnumConstants()) {
                    if (sameSite.name().equalsIgnoreCase(str)) {
                        return sameSite;
                    }
                }
                return null;
            }
            return null;
        }
    }

    private CookieHeaderNames() {
    }
}
