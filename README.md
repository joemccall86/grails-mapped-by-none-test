# grails-mapped-by-none-test
A test grails project that tests the mappedBy:"none" feature in unit tests

https://github.com/grails/grails-core/issues/669

To reproduce:

```
$ sdk use grails 2.5.3
$ grails test-app
```

Expected behavior: test passes
Actual behavior: tests fail with following stack trace
```
| Failure:  test a thing(grails22test.PersonServiceTests)
|  org.grails.datastore.mapping.model.IllegalMappingException: Non-existent mapping property [none] specified for property [players] in class [grails22test.SoftballTeamPreference]
	at org.grails.datastore.mapping.model.config.GormMappingConfigurationStrategy.establishRelationshipForCollection(GormMappingConfigurationStrategy.java:363)
	at org.grails.datastore.mapping.model.config.GormMappingConfigurationStrategy.getPersistentProperties(GormMappingConfigurationStrategy.java:206)
	at org.grails.datastore.mapping.model.AbstractPersistentEntity.initialize(AbstractPersistentEntity.java:87)
	at org.grails.datastore.mapping.model.config.GormMappingConfigurationStrategy.getOrCreateAssociatedEntity(GormMappingConfigurationStrategy.java:674)
	at org.grails.datastore.mapping.model.config.GormMappingConfigurationStrategy.establishDomainClassRelationship(GormMappingConfigurationStrategy.java:631)
	at org.grails.datastore.mapping.model.config.GormMappingConfigurationStrategy.getPersistentProperties(GormMappingConfigurationStrategy.java:214)
	at org.grails.datastore.mapping.model.AbstractPersistentEntity.initialize(AbstractPersistentEntity.java:87)
	at org.grails.datastore.mapping.model.AbstractMappingContext.initializePersistentEntity(AbstractMappingContext.java:250)
	at org.grails.datastore.mapping.model.AbstractMappingContext.addPersistentEntities(AbstractMappingContext.java:183)
	at grails.test.mixin.domain.DomainClassUnitTestMixin.mockDomains(DomainClassUnitTestMixin.groovy:86)
	at org.spockframework.util.ReflectionUtil.invokeMethod(ReflectionUtil.java:153)
	at org.spockframework.runtime.model.MethodInfo.invoke(MethodInfo.java:84)
	at org.spockframework.runtime.extension.MethodInvocation.proceed(MethodInvocation.java:88)
	at org.spockframework.runtime.extension.builtin.AbstractRuleInterceptor$1.evaluate(AbstractRuleInterceptor.java:37)
	at grails.test.runtime.TestRuntimeJunitAdapter$1$2.evaluate(TestRuntimeJunitAdapter.groovy:49)
	at org.spockframework.runtime.extension.builtin.TestRuleInterceptor.intercept(TestRuleInterceptor.java:38)
	at org.spockframework.runtime.extension.MethodInvocation.proceed(MethodInvocation.java:87)
	at org.spockframework.runtime.extension.MethodInvocation.proceed(MethodInvocation.java:88)
	at org.spockframework.runtime.extension.builtin.AbstractRuleInterceptor$1.evaluate(AbstractRuleInterceptor.java:37)
	at grails.test.runtime.TestRuntimeJunitAdapter$3$4.evaluate(TestRuntimeJunitAdapter.groovy:76)
	at org.spockframework.runtime.extension.builtin.ClassRuleInterceptor.intercept(ClassRuleInterceptor.java:38)
	at org.spockframework.runtime.extension.MethodInvocation.proceed(MethodInvocation.java:87)
| Completed 1 unit test, 1 failed in 0m 2s
| Tests FAILED  - view reports in /home/joe/code/grails24test/target/test-reports
```
