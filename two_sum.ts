function twoSum(nums: number[], target: number): number[] {
  let positions = arrayToDictionary(nums);
  for (let i = 0; i < nums.length; i++) {
    let num_1 = nums[i];
    let num_2 = target - num_1;
    let position = positions[num_2];
    if (position !== undefined && position !== i) {
      return [i, position];
    }
  }
  return [];
}

function arrayToDictionary(arr: number[]): { [key: number]: number } {
  const dictionary: { [key: number]: number } = {};
  arr.forEach((num, index) => {
    dictionary[num] = index;
  });
  return dictionary;
}
