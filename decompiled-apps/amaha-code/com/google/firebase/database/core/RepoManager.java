package com.google.firebase.database.core;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.InternalHelpers;
import java.util.HashMap;
import java.util.Map;
import sc.e;
/* loaded from: classes.dex */
public class RepoManager {
    private static final RepoManager instance = new RepoManager();
    private final Map<Context, Map<String, Repo>> repos = new HashMap();

    public static void clear() {
        instance.clearRepos();
    }

    private void clearRepos() {
        synchronized (this.repos) {
            this.repos.clear();
        }
    }

    private Repo createLocalRepo(Context context, RepoInfo repoInfo, FirebaseDatabase firebaseDatabase) {
        Repo repo;
        context.freeze();
        String str = "https://" + repoInfo.host + "/" + repoInfo.namespace;
        synchronized (this.repos) {
            if (!this.repos.containsKey(context)) {
                this.repos.put(context, new HashMap());
            }
            Map<String, Repo> map = this.repos.get(context);
            if (!map.containsKey(str)) {
                repo = new Repo(repoInfo, context, firebaseDatabase);
                map.put(str, repo);
            } else {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
        }
        return repo;
    }

    public static Repo createRepo(Context context, RepoInfo repoInfo, FirebaseDatabase firebaseDatabase) {
        return instance.createLocalRepo(context, repoInfo, firebaseDatabase);
    }

    private Repo getLocalRepo(Context context, RepoInfo repoInfo) {
        Repo repo;
        context.freeze();
        String str = "https://" + repoInfo.host + "/" + repoInfo.namespace;
        synchronized (this.repos) {
            if (!this.repos.containsKey(context) || !this.repos.get(context).containsKey(str)) {
                InternalHelpers.createDatabaseForTests(e.e(), repoInfo, (DatabaseConfig) context);
            }
            repo = this.repos.get(context).get(str);
        }
        return repo;
    }

    public static Repo getRepo(Context context, RepoInfo repoInfo) {
        return instance.getLocalRepo(context, repoInfo);
    }

    public static void interrupt(Context context) {
        instance.interruptInternal(context);
    }

    private void interruptInternal(final Context context) {
        RunLoop runLoop = context.getRunLoop();
        if (runLoop != null) {
            runLoop.scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.RepoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean z10;
                    synchronized (RepoManager.this.repos) {
                        if (RepoManager.this.repos.containsKey(context)) {
                            loop0: while (true) {
                                z10 = true;
                                for (Repo repo : ((Map) RepoManager.this.repos.get(context)).values()) {
                                    repo.interrupt();
                                    if (!z10 || repo.hasListeners()) {
                                        z10 = false;
                                    }
                                }
                            }
                            if (z10) {
                                context.stop();
                            }
                        }
                    }
                }
            });
        }
    }

    public static void resume(final Repo repo) {
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.RepoManager.2
            @Override // java.lang.Runnable
            public void run() {
                Repo.this.resume();
            }
        });
    }

    private void resumeInternal(final Context context) {
        RunLoop runLoop = context.getRunLoop();
        if (runLoop != null) {
            runLoop.scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.RepoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (RepoManager.this.repos) {
                        if (RepoManager.this.repos.containsKey(context)) {
                            for (Repo repo : ((Map) RepoManager.this.repos.get(context)).values()) {
                                repo.resume();
                            }
                        }
                    }
                }
            });
        }
    }

    public static void interrupt(final Repo repo) {
        repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.RepoManager.1
            @Override // java.lang.Runnable
            public void run() {
                Repo.this.interrupt();
            }
        });
    }

    public static void resume(Context context) {
        instance.resumeInternal(context);
    }
}
