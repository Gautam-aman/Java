package pattern.Builder;

class HttpRequest {
    private String url;
    private String method;
    private String body;
    private int timeout;

    private HttpRequest() {};

    public void execute(){
        System.out.println("Url is " + url);
        System.out.println("Method is " + method);
        System.out.println("Body is " + body);
        System.out.println("Timeout is " + timeout);
    }

    // Step Builder
    public static class HttpRequestBuilder implements UrlStep, MethodStep, BodyStep, TimeoutStep, BuildStep {

        private HttpRequest req;

        private HttpRequestBuilder() {
            req = new HttpRequest();
        }

        public static UrlStep builder() {
            return new HttpRequestBuilder();
        }

        @Override
        public MethodStep addUrl(String url) {
            req.url = url;
            return this;
        }

        @Override
        public BodyStep addMethod(String method) {
            req.method = method;
            return this;
        }

        @Override
        public TimeoutStep addBody(String body) {
            req.body = body;
            return this;
        }

        @Override
        public BuildStep addTimeout(int timeout) {
            req.timeout = timeout;
            return this;
        }

        @Override
        public HttpRequest build() {
            return req;
        }
    }
}

// Step interfaces

interface UrlStep {
    MethodStep addUrl(String url);
}

interface MethodStep {
    BodyStep addMethod(String method);
}

interface BodyStep {
    TimeoutStep addBody(String body);
}

interface TimeoutStep {
    BuildStep addTimeout(int timeout);
}

interface BuildStep {
    HttpRequest build();
}


public class StepBuilder {
    public static void main(String[] args) {
        HttpRequest req = HttpRequest.HttpRequestBuilder.builder()
                .addUrl("https://api.example.com")
                .addMethod("POST")
                .addBody("{id:100}")
                .addTimeout(5000)
                .build();

        req.execute();
    }
}
