package a1;

import a1.a;
import android.graphics.Rect;
import java.util.Comparator;
import u0.h;
/* compiled from: FocusStrategy.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: FocusStrategy.java */
    /* loaded from: classes.dex */
    public interface a<T> {
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: a1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003b<T> implements Comparator<T> {

        /* renamed from: u  reason: collision with root package name */
        public final Rect f141u = new Rect();

        /* renamed from: v  reason: collision with root package name */
        public final Rect f142v = new Rect();

        /* renamed from: w  reason: collision with root package name */
        public final boolean f143w;

        /* renamed from: x  reason: collision with root package name */
        public final a<T> f144x;

        public C0003b(boolean z10, a.C0002a c0002a) {
            this.f143w = z10;
            this.f144x = c0002a;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            a.C0002a c0002a = (a.C0002a) this.f144x;
            c0002a.getClass();
            Rect rect = this.f141u;
            ((h) t3).d(rect);
            c0002a.getClass();
            Rect rect2 = this.f142v;
            ((h) t10).d(rect2);
            int i6 = rect.top;
            int i10 = rect2.top;
            if (i6 < i10) {
                return -1;
            }
            if (i6 > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            boolean z10 = this.f143w;
            if (i11 < i12) {
                if (!z10) {
                    return -1;
                }
                return 1;
            } else if (i11 > i12) {
                if (z10) {
                    return -1;
                }
                return 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 < i14) {
                    return -1;
                }
                if (i13 > i14) {
                    return 1;
                }
                int i15 = rect.right;
                int i16 = rect2.right;
                if (i15 < i16) {
                    if (!z10) {
                        return -1;
                    }
                    return 1;
                } else if (i15 > i16) {
                    if (z10) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i6, Rect rect, Rect rect2, Rect rect3) {
        boolean z10;
        int i10;
        int i11;
        boolean b10 = b(i6, rect, rect2);
        if (b(i6, rect, rect3) || !b10) {
            return false;
        }
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        if (!z10 || i6 == 17 || i6 == 66) {
            return true;
        }
        int d10 = d(i6, rect, rect2);
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        i10 = rect3.bottom;
                        i11 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i10 = rect3.right;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect3.top;
            }
        } else {
            i10 = rect.left;
            i11 = rect3.left;
        }
        if (d10 >= Math.max(1, i10 - i11)) {
            return false;
        }
        return true;
    }

    public static boolean b(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static boolean c(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        int i10 = rect.top;
                        int i11 = rect2.top;
                        if ((i10 >= i11 && rect.bottom > i11) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 >= i13 && rect.right > i13) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 <= i15 && rect.top < i15) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if ((i16 <= i17 && rect.left < i17) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static int d(int i6, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        i10 = rect2.top;
                        i11 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i10 = rect2.left;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect2.bottom;
            }
        } else {
            i10 = rect.left;
            i11 = rect2.right;
        }
        return Math.max(0, i10 - i11);
    }

    public static int e(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
