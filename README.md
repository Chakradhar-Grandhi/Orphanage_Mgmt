# Project Name - Orphanage Management

### Project Overview

According to UNICEF there are 140 million orphans in the world (survey done in 2015). Out of those 15.1 million have lost both their parents and are living in orphanage. Most researches have shown that these orphanages are not in proper condition or can provide the basic necessities to the children living in them. Orphans are suffering through a lot in terms of coping up with this world. They are not just deficient of the love of the parents but other facilities as well such as health care (including both mental and physical health)

`Orphanage Management` is being developed to aid these orphanages by coordinating with orphanages, police stations, hospitals and finance organizations in the city to bring up the orphans and provide them the necessities. Apart from that the application would be able to provide the tracking on
- Medical history of the child
- Investigation into the cases of missing child or any misbehavior with the child or by the child
- Adoption tracking and parent feedback
- Finances at the orphanage level

### Key Entities of the application:
- Orphanages Enterprise: These are the orphanages at the ground level who are taking care of the orphans. The entities in this enterprise is as follows:
  - Child care organization
  - Child finance organization
  - Child registration organization
  - Administrator - employee and its credentials.
  
- Hospital Enterprise: This is the healthcare system which would be handling medical records and history of the `child` present in the organization. They would include the classes as
  - Doctors Organization
  - Laboratory Organization
  - Pharmacy Organization
  - Administrator - employee and its credentials.

- Adoption Enterprise: The adoption department is dealing with the request that are coming from the `Adopters` for the adoption of the kids. The key classes are:
  - Adopters Organization (An organization that manage potential parents who want to adopt)
  - Adoption Organization 
  - Administrator - employee and its credentials.

- Accreditation Enterprise: The accreditation enterprise is dealing with investigation of Adopters.
  - Background Check Organization
  - Finance Check Organization
  - Administrator - employee and its credentials.

### Class Diagram
UML Class Diagram ![Alt Class Diagram](./UML_Diagrams/UML_Class_Diagram.jpg "Class Diagram")

### Sequence Diagram
Admins Sequence Diagram ![Alt Class Diagram](./UML_Diagrams/SequenceDiagram.jpg "Admin Sequence Diagram")

### Tech Stack
- Java + Swing UI + JUnit Testcases + JavaxMail + DB4O
- IDE Used NetBeans 

### How to run project
- Open project in NetBeans
- Run project or Press F6
