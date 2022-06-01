package me.rallings.javaday22springbootpayroll;

public interface Person {

        public Long getId();

        public String getName();

        public String getRole();

        public void setId(Long id);

        public void setName(String name);

        public void setRole(String role);

        public boolean equals(Object o);

        public int hashCode();

        public String toString();
}
