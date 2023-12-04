package io.sentry;

import io.sentry.protocol.User;
/* loaded from: classes4.dex */
public interface IScopeObserver {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void removeExtra(String str);

    void removeTag(String str);

    void setExtra(String str, String str2);

    void setTag(String str, String str2);

    void setUser(User user);
}
