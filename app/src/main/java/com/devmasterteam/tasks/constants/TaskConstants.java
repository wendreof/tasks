package com.devmasterteam.tasks.constants;

public class TaskConstants {

    public static class HEADER {
        public static final String TOKEN_KEY = "token";
        public static final String PERSON_KEY = "personkey";
    }

    public static class ENDPOINT {
        public static final String AUTHENTICATION_CREATE = "Authentication/Create";
        public static final String AUTHENTICATION_LOGIN = "Authentication/Login";
        public static final String ROOT = "http://www.devmasterteam.com/CursoAndroid/API";

        public static final String TASK_GET_LIST_NO_FILTER = "Task";
        public static final String TASK_GET_LIST_OVERDUE = "Task/Overdue";
        public static final String TASK_GET_LIST_NEXT_7_DAYS = "Task/Next7Days";
        public static final String TASK_GET_SPECIFC = "Task";
        public static final String TASK_GET_UPDATE = "Task";
        public static final String TASK_GET_INSERT = "Task";
        public static final String TASK_GET_COMPLETE = "Task/Complete";
        public static final String TASK_GET_UNCOMPLETE = "Task/Uncomplete";

        public static final String PRIORITY_GET = "priority";
    }

    public static class OPERATION_METHOD {
        public static final String GET = "GET";
        public static final String PUT = "PUT";
        public static final String DELETE = "DELETE";
        public static final String POST = "POST";
    }

    public static class STATUS_CODE {
        public static final int SUCCESS = 200;
        public static final int FORBIDEN = 403;
        public static final int NOT_FOUND = 404;
        public static final int INTERNAL_SERVER_ERROR = 500;
        public static final int INTERNET_NOT_AVAILABLE = 901;
    }
}
