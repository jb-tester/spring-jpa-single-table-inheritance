# Entity inheritance = SingleTable 
The special property class accesses the discriminator value of an instance in the case of polymorphic persistence. A Java class name embedded in the where clause will be translated to its discriminator value.
Actually this is not supported by IDEA:
[problem with .class property resolving](https://youtrack.jetbrains.com/issue/IDEA-296168)