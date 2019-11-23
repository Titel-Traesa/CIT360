package hibernate.traesa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(students.class)
public abstract class students_ {

	public static volatile SingularAttribute<students, Integer> grade;
	public static volatile SingularAttribute<students, String> name;
	public static volatile SingularAttribute<students, Integer> id;

	public static final String GRADE = "grade";
	public static final String NAME = "name";
	public static final String ID = "id";

}

