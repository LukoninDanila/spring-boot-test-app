FROM adoptopenjdk/openjdk8

ENV PLATFORM_RUNTIME_ENVIRONMENT=OPENSHIFT

COPY ./test-deploy-openshift*.jar test-deploy-openshift.jar
COPY entrypoint.sh entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/entrypoint.sh"]
