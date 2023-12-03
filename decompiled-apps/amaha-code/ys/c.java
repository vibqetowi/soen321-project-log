package ys;

import java.util.List;
import java.util.Map;
/* compiled from: KCallable.kt */
/* loaded from: classes2.dex */
public interface c<R> extends b {
    R call(Object... objArr);

    R callBy(Map<j, ? extends Object> map);

    String getName();

    List<j> getParameters();

    n getReturnType();

    List<o> getTypeParameters();

    q getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
