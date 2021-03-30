# AnimalModel
Модель животного мира с исключительными ситуациями

Создано три пакета: "Exception", "Main", "Model".
В пакете "Model" 5 классов "Animal", "Food", "Predator", "Herb", "Herbevore"
В пакете "Main" 1 класс "Main", содержащий точку входа в программу 
В пакете "Exception" 5 классов-исключений: "IllegalDieAnimalException", "IllegalFoodDieExeption", "IllegalFoodNotAnimalException", "IllegalFoodNotHerbExeption", "IllegalMassaExceptionMassa". Все классы наследованы от IllegalArgumentException, либо от IllegalStateException.

Бизнес-логика: существуют хищники, травоядные, и трава. Хищники могут есть хищников и травоядных. Травоядные могут есть только траву. При съедении кого-либо, масса животного увеличивалась на массу съеденного 

