package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes5.dex */
public class ThreadUtils {
    public static final AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new AlwaysTruePredicate();

    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface ThreadGroupPredicate {
        boolean test(ThreadGroup threadGroup);
    }

    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface ThreadPredicate {
        boolean test(Thread thread);
    }

    public static Thread findThreadById(long j, ThreadGroup threadGroup) {
        Validate.notNull(threadGroup, "The thread group must not be null", new Object[0]);
        Thread findThreadById = findThreadById(j);
        if (findThreadById == null || !threadGroup.equals(findThreadById.getThreadGroup())) {
            return null;
        }
        return findThreadById;
    }

    public static Thread findThreadById(long j, String str) {
        Validate.notNull(str, "The thread group name must not be null", new Object[0]);
        Thread findThreadById = findThreadById(j);
        if (findThreadById == null || findThreadById.getThreadGroup() == null || !findThreadById.getThreadGroup().getName().equals(str)) {
            return null;
        }
        return findThreadById;
    }

    public static Collection<Thread> findThreadsByName(String str, ThreadGroup threadGroup) {
        return findThreads(threadGroup, false, new NamePredicate(str));
    }

    public static Collection<Thread> findThreadsByName(String str, String str2) {
        Validate.notNull(str, "The thread name must not be null", new Object[0]);
        Validate.notNull(str2, "The thread group name must not be null", new Object[0]);
        Collection<ThreadGroup> findThreadGroups = findThreadGroups(new NamePredicate(str2));
        if (findThreadGroups.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        NamePredicate namePredicate = new NamePredicate(str);
        for (ThreadGroup threadGroup : findThreadGroups) {
            arrayList.addAll(findThreads(threadGroup, false, namePredicate));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> findThreadGroupsByName(String str) {
        return findThreadGroups(new NamePredicate(str));
    }

    public static Collection<ThreadGroup> getAllThreadGroups() {
        return findThreadGroups(ALWAYS_TRUE_PREDICATE);
    }

    public static ThreadGroup getSystemThreadGroup() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }

    public static Collection<Thread> getAllThreads() {
        return findThreads(ALWAYS_TRUE_PREDICATE);
    }

    public static Collection<Thread> findThreadsByName(String str) {
        return findThreads(new NamePredicate(str));
    }

    public static Thread findThreadById(long j) {
        Collection<Thread> findThreads = findThreads(new ThreadIdPredicate(j));
        if (findThreads.isEmpty()) {
            return null;
        }
        return findThreads.iterator().next();
    }

    /* loaded from: classes5.dex */
    private static final class AlwaysTruePredicate implements ThreadPredicate, ThreadGroupPredicate {
        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return true;
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(ThreadGroup threadGroup) {
            return true;
        }

        private AlwaysTruePredicate() {
        }
    }

    /* loaded from: classes5.dex */
    public static class NamePredicate implements ThreadPredicate, ThreadGroupPredicate {
        private final String name;

        public NamePredicate(String str) {
            Validate.notNull(str, "The name must not be null", new Object[0]);
            this.name = str;
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(ThreadGroup threadGroup) {
            return threadGroup != null && threadGroup.getName().equals(this.name);
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return thread != null && thread.getName().equals(this.name);
        }
    }

    /* loaded from: classes5.dex */
    public static class ThreadIdPredicate implements ThreadPredicate {
        private final long threadId;

        public ThreadIdPredicate(long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("The thread id must be greater than zero");
            }
            this.threadId = j;
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return thread != null && thread.getId() == this.threadId;
        }
    }

    public static Collection<Thread> findThreads(ThreadPredicate threadPredicate) {
        return findThreads(getSystemThreadGroup(), true, threadPredicate);
    }

    public static Collection<ThreadGroup> findThreadGroups(ThreadGroupPredicate threadGroupPredicate) {
        return findThreadGroups(getSystemThreadGroup(), true, threadGroupPredicate);
    }

    public static Collection<Thread> findThreads(ThreadGroup threadGroup, boolean z, ThreadPredicate threadPredicate) {
        Thread[] threadArr;
        int enumerate;
        Validate.notNull(threadGroup, "The group must not be null", new Object[0]);
        Validate.notNull(threadPredicate, "The predicate must not be null", new Object[0]);
        int activeCount = threadGroup.activeCount();
        while (true) {
            int i = activeCount + (activeCount / 2) + 1;
            threadArr = new Thread[i];
            enumerate = threadGroup.enumerate(threadArr, z);
            if (enumerate < i) {
                break;
            }
            activeCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i2 = 0; i2 < enumerate; i2++) {
            if (threadPredicate.test(threadArr[i2])) {
                arrayList.add(threadArr[i2]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> findThreadGroups(ThreadGroup threadGroup, boolean z, ThreadGroupPredicate threadGroupPredicate) {
        ThreadGroup[] threadGroupArr;
        int enumerate;
        Validate.notNull(threadGroup, "The group must not be null", new Object[0]);
        Validate.notNull(threadGroupPredicate, "The predicate must not be null", new Object[0]);
        int activeGroupCount = threadGroup.activeGroupCount();
        while (true) {
            int i = activeGroupCount + (activeGroupCount / 2) + 1;
            threadGroupArr = new ThreadGroup[i];
            enumerate = threadGroup.enumerate(threadGroupArr, z);
            if (enumerate < i) {
                break;
            }
            activeGroupCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i2 = 0; i2 < enumerate; i2++) {
            if (threadGroupPredicate.test(threadGroupArr[i2])) {
                arrayList.add(threadGroupArr[i2]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }
}
